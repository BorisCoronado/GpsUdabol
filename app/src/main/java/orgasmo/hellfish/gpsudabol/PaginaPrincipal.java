package orgasmo.hellfish.gpsudabol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PaginaPrincipal extends AppCompatActivity implements SearchView.OnQueryTextListener, MenuItemCompat.OnActionExpandListener, View.OnClickListener {

    private TextView textoBuscado;
    private Button encuentra,datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);
        textoBuscado = (TextView) findViewById(R.id.textoBuscado);
        encuentra = (Button) findViewById(R.id.button);
        datos = (Button) findViewById(R.id.button2);
        encuentra.setOnClickListener(this);
        datos.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pagina_principal, menu);
        MenuItem searchItem = menu.findItem(R.id.menu_buscador);

        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setOnQueryTextListener(this);

        MenuItemCompat.setOnActionExpandListener(searchItem, this);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onMenuItemActionExpand(MenuItem item) {
        Toast.makeText(getApplicationContext(), "Buscador activado", Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public boolean onMenuItemActionCollapse(MenuItem item) {
        Toast.makeText(getApplicationContext(), "Buscador desactivado", Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        //textoBuscado.setText("Texto buscado\n\n" + s);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        //textoBuscado.setText("Escribiendo texto buscado...\n\n" + s);
        return false;
    }


    public void acercaDe(MenuItem m){
        Intent i = new Intent(this,AcercaDe.class);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.button:
                i = new Intent(this, pagina2.class);
                startActivity(i);
                break;
            case R.id.button2:
                i = new Intent(this, DatosDeInteres.class);
                startActivity(i);
                break;
        }
    }
}
