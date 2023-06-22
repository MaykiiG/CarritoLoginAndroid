package com.example.main;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Mostrar extends AppCompatActivity {

    TextView tvCantProductos;
    Button btnVerCarro;
    RecyclerView rvListaProductos;
    AdaptadorProductos adaptador;

    List<Producto> listaProductos = new ArrayList<>();
    List<Producto> carroCompras = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar);
        getSupportActionBar().hide();

        tvCantProductos = findViewById(R.id.tvCantProductos);
        btnVerCarro = findViewById(R.id.btnVerCarro);
        rvListaProductos = findViewById(R.id.rvListaProductos);
        rvListaProductos.setLayoutManager(new GridLayoutManager(Mostrar.this, 1));

        listaProductos.add(new Producto("1", "Tokyo Ghoul",
                "Un estudiante universitario es atacado por un demonio que se alimenta de carne humana. Más tarde recibe un trasplante de un órgano de la criatura, convirtiéndose parcialmente en un monstruo.", 50.0));
        listaProductos.add(new Producto("2", "Naruto",
                "Naruto es una serie de manga escrita e ilustrada por Masashi Kishimoto, posteriormente adaptada a una a serie de anime.", 80.0));
        listaProductos.add(new Producto("3", "Bleach",
                "Narra las aventuras de Ichigo Kurosaki, un joven adolescente de quince años de edad que accidentalmente absorbe los poderes de una shinigami —personificación japonesa del Dios de la muerte", 40.0));
        listaProductos.add(new Producto("4", "Tokyo Revengers",
                "Tokyo Revengers es una serie de manga escrita e ilustrada por Ken Wakui, publicada en el semanario Shūkan Shōnen Magazine de Kōdansha desde marzo de 2017. ", 20.0));
        listaProductos.add(new Producto("5", "Golden Time",
                "Golden Time es una serie de novelas ligeras japonesas escritas por Yuyuko Takemiya e ilustradas por Ēji Komatsu. Fue publicada por ASCII Media Works bajo su sello", 56.0));

        adaptador = new AdaptadorProductos(Mostrar.this, tvCantProductos, btnVerCarro, listaProductos, carroCompras);
        rvListaProductos.setAdapter(adaptador);
    }
}