package cat.dam.andy.animacions;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv_mosquito;
    AnimationDrawable animated_mosquito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_animations();
    }

    private void init_animations() {
        anim_egg_chicken();
        anim_egg_falling();
        anim_ball_appears();
        anim_ball_rolls();
        anim_ball_bounces();
        anim_ball_rolls_comes();
        anim_mosquito_flying();
    }

    private void anim_egg_chicken() {
        ImageView iv_egg =(ImageView) findViewById(R.id.iv_egg1);
        iv_egg.setOnClickListener(v -> {
            // Canviem la imatge assignant-li l'altre recurs
            iv_egg.setImageResource(R.drawable.chicken);
        });
    }

    private void anim_egg_falling() {
        ImageView iv_egg =(ImageView) findViewById(R.id.iv_egg2);
        Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_falling);
        iv_egg.setOnClickListener(v -> {
            // Canviem la imatge assignant-li l'altre recurs
            iv_egg.startAnimation(anim);
        });
    }

    private void anim_ball_appears() {
        final ImageView iv_ball1 = (ImageView)findViewById(R.id.iv_ball1);
        Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_appears);
        iv_ball1.setOnClickListener(v -> {
            // Canviem la imatge assignant-li l'altre recurs
            iv_ball1.startAnimation(anim);
        });
    }

    private void anim_ball_rolls() {
        final ImageView iv_ball2 = (ImageView)findViewById(R.id.iv_ball2);
        Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_rolls);
        iv_ball2.setOnClickListener(v -> {
            // Canviem la imatge assignant-li l'altre recurs
            iv_ball2.startAnimation(anim);
        });
    }

    private void anim_ball_bounces() {
        final ImageView iv_ball3 = (ImageView)findViewById(R.id.iv_ball3);
        Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_bounces);
        iv_ball3.setOnClickListener(v -> {
            // Canviem la imatge assignant-li l'altre recurs
            iv_ball3.startAnimation(anim);
        });
    }

    private void anim_ball_rolls_comes() {
        final ImageView iv_ball4 = (ImageView)findViewById(R.id.iv_ball4);
        Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_rolls_comes);
        iv_ball4.setOnClickListener(v -> {
            // Canviem la imatge assignant-li l'altre recurs
            iv_ball4.startAnimation(anim);
        });
    }

    private void anim_mosquito_flying() {
        animated_mosquito = new AnimationDrawable();
        // Carrega el ImageView que contindrà l'animació i actualiza el fons d'imatge amb el recurs XML on es defineix les imatges
        // i temps d'animació del mosquit
        iv_mosquito = (ImageView) findViewById(R.id.iv_mosquit);
        // Situem la imatge en la pantalla
        iv_mosquito.setX(100);
        iv_mosquito.setY(150);
        iv_mosquito.setBackgroundResource(R.drawable.animation_mosquito);
        // Obté el fons que ha estat compilat amb un objecte AnimationDrawable
        animated_mosquito = (AnimationDrawable) iv_mosquito.getBackground();
        // Comença l'animació (per defecte repetició de cicle).
        animated_mosquito.start();
        iv_mosquito.setOnClickListener(view -> {
            // En cas de que es cliqui el mosquit actualiza el fons d'imatge amb el recurs XML on es defineix les imatges
            // i temps d'animació de la taca de sang
            iv_mosquito.setBackgroundResource(R.drawable.animation_blood);
            animated_mosquito = (AnimationDrawable) iv_mosquito.getBackground();
            // Fes l'animació (només un cicle).
            animated_mosquito.start();
        });
    }

}
