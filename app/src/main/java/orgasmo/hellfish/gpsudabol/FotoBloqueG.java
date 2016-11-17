package orgasmo.hellfish.gpsudabol;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FotoBloqueG.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FotoBloqueG#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FotoBloqueG extends Fragment implements View.OnClickListener{

    private Button g2,g3,g4,g5,g6,g7,g8,g9,g10;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public FotoBloqueG() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FotoBloqueG.
     */
    // TODO: Rename and change types and number of parameters
    public static FotoBloqueG newInstance(String param1, String param2) {
        FotoBloqueG fragment = new FotoBloqueG();
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
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_foto_bloque_g, container, false);
        if(v!=null){
            g2 = (Button) v.findViewById(R.id.g2);
            g3 = (Button) v.findViewById(R.id.g3);
            g4 = (Button) v.findViewById(R.id.g4);
            g5 = (Button) v.findViewById(R.id.g5);
            g6 = (Button) v.findViewById(R.id.g6);
            g7 = (Button) v.findViewById(R.id.g7);
            g8 = (Button) v.findViewById(R.id.g8);
            g9 = (Button) v.findViewById(R.id.g9);
            g10 = (Button) v.findViewById(R.id.g10);
            g2.setOnClickListener(this);
            g3.setOnClickListener(this);
            g4.setOnClickListener(this);
            g5.setOnClickListener(this);
            g6.setOnClickListener(this);
            g7.setOnClickListener(this);
            g8.setOnClickListener(this);
            g9.setOnClickListener(this);
            g10.setOnClickListener(this);
        }
        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View v) {
        Intent i;
        String valor = "";
        i = new Intent(getActivity(),FotoAulas.class);
        switch (v.getId()){
            case R.id.g2:
                valor = "g2";
                break;
            case R.id.g3:
                valor = "g3";
                break;
            case R.id.g4:
                valor = "g4";
                break;
            case R.id.g5:
                valor = "g5";
                break;
            case R.id.g6:
                valor = "g6";
                break;
            case R.id.g7:
                valor = "g7";
                break;
            case R.id.g8:
                valor = "g8";
                break;
            case R.id.g9:
                valor = "g9";
                break;
            case R.id.g10:
                valor = "g10";
                break;
        }
        i.putExtra("id",valor);
        getActivity().startActivity(i);
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
