package com.example.myapplication;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Déclaration des variables pour les éléments de l'interface utilisateur
    private EditText emailEditText, passwordEditText;
    private Button loginButton;

    // Simulation de données d'utilisateur (e-mail et mot de passe)
    private static final String CORRECT_EMAIL = "utilisateur@example.com";
    private static final String CORRECT_PASSWORD = "password123";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisation des éléments de l'interface utilisateur
        emailEditText = findViewById(R.id.textView);
        passwordEditText = findViewById(R.id.modpasseEditText);
        loginButton = findViewById(R.id.loginButton);

        // Définir le clic sur le bouton de connexion
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Récupérer les informations saisies par l'utilisateur
                String enteredEmail = emailEditText.getText().toString().trim();
                String enteredPassword = passwordEditText.getText().toString().trim();

                // Vérifier si les informations saisies sont correctes
                if (enteredEmail.equals(CORRECT_EMAIL) && enteredPassword.equals(CORRECT_PASSWORD)) {
                    // Si les informations sont correctes, ouvrir l'application principale
                    openMainActivity();
                } else {
                    // Si les informations sont incorrectes, afficher un message d'erreur
                    Toast.makeText(MainActivity.this, "E-mail ou mot de passe saisi est incorrect!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Méthode pour ouvrir l'application principale
    private void openMainActivity() {
        // Ici, vous pouvez ouvrir votre activité principale ou faire toute autre action nécessaire
        // Par exemple :
        // Intent intent = new Intent(this, MainActivity.class);
        // startActivity(intent);

        // Pour cet exemple, nous allons simplement fermer l'activité de connexion
        finish();
    }
}
