package id.neharosma.bunga_bunga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMelati.setOnClickListener { goToMelatiActivity() }
        btnAnggrek.setOnClickListener { goToAnggrekActivity() }
        btnBugenvil.setOnClickListener { goToBugenvilActivity() }
        btnIris.setOnClickListener { goToIrisActivity() }
        btnKembangSepatu.setOnClickListener { goToKembangSepatuActivity() }
        btnMawar.setOnClickListener { goToMawarActiviy() }
        btnPentas.setOnClickListener { goToPentasActivity() }
        btnPetunia.setOnClickListener { goToPetuniaActivity() }
        btnTeratai.setOnClickListener { goToTerataiActivity() }
        btnTulip.setOnClickListener { goToTulipActivity() }
    }

    private fun goToTulipActivity() {
        val intent = Intent(this,TulipActivity::class.java)
        startActivity(intent)
    }

    private fun goToTerataiActivity() {
        val intent = Intent(this,TerataiActivity::class.java)
        startActivity(intent)
    }

    private fun goToPetuniaActivity() {
        val intent = Intent(this,PetuniaActivity::class.java)
        startActivity(intent)
    }

    private fun goToPentasActivity() {
        val intent = Intent(this,PentasActivity::class.java)
        startActivity(intent)
    }

    private fun goToMawarActiviy() {
        val intent = Intent(this,MawarActivity::class.java)
        startActivity(intent)
    }

    private fun goToKembangSepatuActivity() {
        val intent = Intent(this,KembangSepatuActivity::class.java)
        startActivity(intent)
    }

    private fun goToIrisActivity() {
        val intent = Intent(this,IrisActivity::class.java)
        startActivity(intent)
    }

    private fun goToBugenvilActivity() {
        val intent = Intent(this,BugenvilActivity::class.java)
        startActivity(intent)
    }

    private fun goToAnggrekActivity() {
        val intent = Intent(this,AnggrekActivity::class.java)
        startActivity(intent)
    }

    private fun goToMelatiActivity(){
        val intent = Intent(this,MelatiActivity::class.java)
        startActivity(intent)
    }
}
