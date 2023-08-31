package cl.jpvs.modulo5ejercicio6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cl.jpvs.modulo5ejercicio6.databinding.FragmentPrimerBinding;
public class PrimerFragment extends Fragment {
    private FragmentPrimerBinding binding;
    List<Fotos> fotos = listaItemList();

    private List<Fotos> listaItemList() {
        List<Fotos> listItem = new ArrayList<>();
        Fotos item01 = new Fotos("Zhuo Cheng you", "https://unsplash.com/photos/UBvtBr_FmrY/download?force=true&w=640");
        listItem.add(item01);
        Fotos item02 = new Fotos("billow926", "https://unsplash.com/photos/pNoP-qVwBFQ/download?force=true&w=640");
        listItem.add(item02);
        Fotos item03 = new Fotos("PhilippDeiß", "https://unsplash.com/photos/LfJx0gqqiEc/download?force=true&w=640");
        listItem.add(item03);
        Fotos item05 = new Fotos("Melnychuk Nataliya", "https://unsplash.com/photos/rnPGCe7LsQo/download?force=true&w=640");
        listItem.add(item05);
        Fotos item06 = new Fotos("Teagan Maddux", "https://unsplash.com/photos/k2DbTXQ0yrQ/download?force=true&w=640");
        listItem.add(item06);
        Fotos item07 = new Fotos("Chen Liu", "https://unsplash.com/photos/kZH8X0q4Nvo/download?force=true&w=640");
        listItem.add(item07);
        Fotos item08 = new Fotos("John Fornander", "https://unsplash.com/photos/iNqJx-VOceI/download?force=true&w=640");
        listItem.add(item08);
        Fotos item09 = new Fotos("Parker Coffman", "https://unsplash.com/photos/mNWrQ9O6KZw/download?force=true&w=640");
        listItem.add(item09);
        Fotos item10 = new Fotos("XPS", "https://unsplash.com/photos/8pb7Hq539Zw/download?force=true&w=640");
        listItem.add(item10);
        Fotos item11 = new Fotos("Daniel J. Schwarz", "https://unsplash.com/photos/l8BvDmt8Ac4/download?force=true&w=640");
        listItem.add(item11);

        return listItem;
    }

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public  PrimerFragment() {

    }

public static PrimerFragment newInstance (String param1, String param2) {
    PrimerFragment fragment = new PrimerFragment();
    Bundle args = new Bundle();
    args.putString(ARG_PARAM1, param1);
    args.putString(ARG_PARAM2, param2);
    fragment.setArguments(args);
    return fragment;
}



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPrimerBinding.inflate(getLayoutInflater(),container, false);
        initAdapter();
        return binding.getRoot();
         }

    private void initAdapter() {
        Adapter adapter = new Adapter();
        adapter.setFoto(fotos);
        binding.rvPrincipal.setAdapter(adapter);

    }


}
