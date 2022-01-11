package cat.dam.andy.animacions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv_mosquit;
    AnimationDrawable mosquit_animat;
    ConstraintLayout main_screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animacioOu();
        animacioOu2();
        animacioMosquit();
        animacioPilota1();
        animacioPilota2();
        animacioPilota3();
        animacioPilota4();

    }

    private void animacioOu() {
        ImageView iv_ou =(ImageView) findViewById(R.id.iv_ou);
        iv_ou.setOnClickListener(v -> {
            // Canviem la imatge assignant-li l'altre recurs
            ImageView visorImatge = (ImageView) findViewById(R.id.iv_ou);
            visorImatge.setImageResource(R.drawable.gall);
        });
    }

    private void animacioOu2() {
        ImageView iv_ou =(ImageView) findViewById(R.id.iv_ou2);
        iv_ou.setOnClickListener(v -> {
            // Canviem la imatge assignant-li l'altre recurs
            ImageView visorImatge = (ImageView) findViewById(R.id.iv_ou);
            Animation animacioPilota = AnimationUtils.loadAnimation(MainActivity.this, R.anim.ouquecau);
            iv_ou.startAnimation(animacioPilota);
        });
    }

    private void animacioPilota1() {
        final ImageView iv_pilota = (ImageView)findViewById(R.id.iv_pilota1);
        iv_pilota.setOnClickListener(v -> {
            // Canviem la imatge assignant-li l'altre recurs
            Animation animacioPilota = AnimationUtils.loadAnimation(MainActivity.this, R.anim.apareixer);
            iv_pilota.startAnimation(animacioPilota);
        });
    }

    private void animacioPilota2() {
        final ImageView iv_pilota = (ImageView)findViewById(R.id.iv_pilota2);
        iv_pilota.setOnClickListener(v -> {
            // Canviem la imatge assignant-li l'altre recurs
            Animation animacioPilota = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rodar);
            iv_pilota.startAnimation(animacioPilota);
        });
    }

    private void animacioPilota3() {
        final ImageView iv_pilota = (ImageView)findViewById(R.id.iv_pilota3);
        iv_pilota.setOnClickListener(v -> {
            // Canviem la imatge assignant-li l'altre recurs
            Animation animacioPilota = AnimationUtils.loadAnimation(MainActivity.this, R.anim.botar);
            iv_pilota.startAnimation(animacioPilota);
        });
    }

    private void animacioPilota4() {
        final ImageView iv_pilota = (ImageView)findViewById(R.id.iv_pilota4);
        iv_pilota.setOnClickListener(v -> {
            // Canviem la imatge assignant-li l'altre recurs
            Animation animacioPilota = AnimationUtils.loadAnimation(MainActivity.this, R.anim.venir);
            iv_pilota.startAnimation(animacioPilota);
        });
    }

    private void animacioMosquit() {
        mosquit_animat = new AnimationDrawable();
        // Carrega el ImageView que contindrà l'animació i actualiza el fons d'imatge amb el recurs XML on es defineix les imatges
        // i temps d'animació del mosquit
        iv_mosquit = (ImageView) findViewById(R.id.iv_mosquit);
        // Situem la imatge en la pantalla
        iv_mosquit.setX(100);
        iv_mosquit.setY(150);
        iv_mosquit.setBackgroundResource(R.drawable.mosquit_animat);
        // Obté el fons que ha estat compilat amb un objecte AnimationDrawable
        mosquit_animat = (AnimationDrawable) iv_mosquit.getBackground();
        // Comença l'animació (per defecte repetició de cicle).
        mosquit_animat.start();
        iv_mosquit.setOnClickListener(view -> {
            // En cas de que es cliqui el mosquit actualiza el fons d'imatge amb el recurs XML on es defineix les imatges
            // i temps d'animació de la taca de sang
            iv_mosquit.setBackgroundResource(R.drawable.sang_animat);
            mosquit_animat = (AnimationDrawable) iv_mosquit.getBackground();
            // Fes l'animació (només un cicle).
            mosquit_animat.start();
        });
    }

}
