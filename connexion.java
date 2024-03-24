package com.example.myapplication;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class connexion extends AppCompatActivity {

    private EditText editTextTitre, editTextDescription;
    private Spinner spinnerCategorie, spinnerSecteur, spinnerTypeContrat, spinnerVille;
    private Button buttonSuivant;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connexion);

        // Initialisation des vues
        editTextTitre = findViewById(R.id.editTextText);
        editTextDescription = findViewById(R.id.editText);
        spinnerCategorie = findViewById(R.id.spinner2);
        spinnerSecteur = findViewById(R.id.spinner3);
        spinnerTypeContrat = findViewById(R.id.spinner4);
        spinnerVille = findViewById(R.id.spinner5);
        buttonSuivant = findViewById(R.id.button);

        // Ajouter un écouteur de clic au bouton "Suivant"
        buttonSuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupérer les données saisies
                String titre = editTextTitre.getText().toString().trim();
                String description = editTextDescription.getText().toString().trim();
                String categorie = spinnerCategorie.getSelectedItem().toString();
                String secteur = spinnerSecteur.getSelectedItem().toString();
                String typeContrat = spinnerTypeContrat.getSelectedItem().toString();
                String ville = spinnerVille.getSelectedItem().toString();

                // Faire quelque chose avec les données, par exemple :
                // Lancer une nouvelle activité ou traiter les données dans cette activité
            }
        });
    }
}


