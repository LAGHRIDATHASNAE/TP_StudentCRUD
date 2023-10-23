package ma.projet.projetws.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

import ma.projet.projetws.R;
import ma.projet.projetws.beans.Etudiant;


public class EtudiantAdapter extends ArrayAdapter<Etudiant> {
    private List<Etudiant> etudiantList;
    private Context context;

    public EtudiantAdapter(Context context, List<Etudiant> etudiantList) {
        super(context, 0, etudiantList);
        this.etudiantList = etudiantList;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Etudiant etudiant = etudiantList.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        }


        TextView nom = convertView.findViewById(R.id.nom);
        TextView prenom = convertView.findViewById(R.id.prenom);
        TextView ville = convertView.findViewById(R.id.ville);
        TextView sexe = convertView.findViewById(R.id.sexe);


        nom.setText("Nom: " + etudiant.getNom());
        prenom.setText("Prenom: " + etudiant.getPrenom());
        ville.setText("Ville: " + etudiant.getVille());
        sexe.setText("Sexe: " + etudiant.getSexe());


        return convertView;
    }
}

