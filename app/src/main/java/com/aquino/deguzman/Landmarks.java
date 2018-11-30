package com.aquino.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Landmarks extends AppCompatActivity{
    private Button buttonNorthAve, buttonRoosevelt, buttonBalintawak, buttonMonumento, buttonFifth, buttonRpapa, buttonAbad,
    buttonBlumentritt, buttonTayuman, buttonBambang, buttonDjose, buttonCarriedo, buttonCentral, buttonUN, buttonPedrogil,
    buttonQuirino, buttonGilpuyat, buttonVitocruz, buttonLibertad, buttonEdsa, buttonBaclaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmarks);

        buttonNorthAve = (Button) findViewById(R.id.button_north);
        buttonNorthAve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityNorthAve();
            }
        });

        buttonRoosevelt = (Button) findViewById(R.id.button_roosevelt);
        buttonRoosevelt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRoosevelt();
            }
        });

        buttonBalintawak = (Button) findViewById(R.id.button_balintawak);
        buttonBalintawak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBalintawak();
            }
        });

        buttonMonumento = (Button) findViewById(R.id.button_monumento);
        buttonMonumento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMonumento();
            }
        });

        buttonFifth = (Button) findViewById(R.id.button_fifth);
        buttonFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityFifth();
            }
        });

        buttonRpapa = (Button) findViewById(R.id.button_rpapa);
        buttonRpapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRpapa();
            }
        });

        buttonAbad = (Button) findViewById(R.id.button_abad);
        buttonAbad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAbadSantos();
            }
        });

        buttonBlumentritt = (Button) findViewById(R.id.button_blumentritt);
        buttonBlumentritt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBlumentritt();
            }
        });

        buttonTayuman = (Button) findViewById(R.id.button_tayuman);
        buttonTayuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityTayuman();
            }
        });

        buttonBambang = (Button) findViewById(R.id.button_bambang);
        buttonBambang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBambang();
            }
        });

        buttonDjose = (Button) findViewById(R.id.button_djose);
        buttonDjose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityDjose();
            }
        });

        buttonCarriedo = (Button) findViewById(R.id.button_carriedo);
        buttonCarriedo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityCarriedo();
            }
        });

        buttonCentral = (Button) findViewById(R.id.button_central);
        buttonCentral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityCentral();
            }
        });

        buttonUN = (Button) findViewById(R.id.button_un);
        buttonUN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityUNAve();
            }
        });

        buttonPedrogil = (Button) findViewById(R.id.button_pedrogil);
        buttonPedrogil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityPedrogil();
            }
        });

        buttonQuirino = (Button) findViewById(R.id.button_quirino);
        buttonQuirino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityQuirino();
            }
        });

        buttonVitocruz = (Button) findViewById(R.id.button_vitocruz);
        buttonVitocruz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityVitocruz();
            }
        });

        buttonGilpuyat = (Button) findViewById(R.id.button_gilpuyat);
        buttonGilpuyat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityGilpuyat();
            }
        });

        buttonLibertad = (Button) findViewById(R.id.button_libertad);
        buttonLibertad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLibertad();
            }
        });

        buttonEdsa = (Button) findViewById(R.id.button_edsa);
        buttonEdsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityEdsa();
            }
        });

        buttonBaclaran = (Button) findViewById(R.id.button_baclaran);
        buttonBaclaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBaclaran();
            }
        });
    }


    public void openActivityNorthAve() {
        Intent intent = new Intent(this, Northave.class);
        startActivity(intent);
    }

    public void openActivityRoosevelt() {
        Intent intent = new Intent(this, Roosevelt.class);
        startActivity(intent);
    }

    public void openActivityBalintawak() {
        Intent intent = new Intent(this, Balintawak.class);
        startActivity(intent);
    }

    public void openActivityMonumento() {
        Intent intent = new Intent(this, Monumento.class);
        startActivity(intent);
    }

    public void openActivityFifth() {
        Intent intent = new Intent(this, Fifthave.class);
        startActivity(intent);
    }

    public void openActivityRpapa() {
        Intent intent = new Intent(this, Rpapa.class);
        startActivity(intent);
    }

    public void openActivityAbadSantos() {
        Intent intent = new Intent(this, AbadSantos.class);
        startActivity(intent);
    }

    public void openActivityBlumentritt() {
        Intent intent = new Intent(this, Blumentritt.class);
        startActivity(intent);
    }

    public void openActivityTayuman() {
        Intent intent = new Intent(this, Tayuman.class);
        startActivity(intent);
    }

    public void openActivityBambang() {
        Intent intent = new Intent(this, Bambang.class);
        startActivity(intent);
    }

    public void openActivityDjose() {
        Intent intent = new Intent(this, DoroteoJose.class);
        startActivity(intent);
    }

    public void openActivityCarriedo() {
        Intent intent = new Intent(this, Carriedo.class);
        startActivity(intent);
    }

    public void openActivityCentral() {
        Intent intent = new Intent(this, Central.class);
        startActivity(intent);
    }

    public void openActivityUNAve() {
        Intent intent = new Intent(this, UNAve.class);
        startActivity(intent);
    }

    public void openActivityPedrogil() {
        Intent intent = new Intent(this, PedroGil.class);
        startActivity(intent);
    }

    public void openActivityQuirino() {
        Intent intent = new Intent(this, Quirino.class);
        startActivity(intent);
    }

    public void openActivityVitocruz() {
        Intent intent = new Intent(this, VitoCruz.class);
        startActivity(intent);
    }

    public void openActivityGilpuyat() {
        Intent intent = new Intent(this, Gilpuyat.class);
        startActivity(intent);
    }

    public void openActivityLibertad() {
        Intent intent = new Intent(this, Libertad.class);
        startActivity(intent);
    }

    public void openActivityEdsa() {
        Intent intent = new Intent(this, Edsa.class);
        startActivity(intent);
    }

    public void openActivityBaclaran() {
        Intent intent = new Intent(this, Baclaran.class);
        startActivity(intent);
    }
}
