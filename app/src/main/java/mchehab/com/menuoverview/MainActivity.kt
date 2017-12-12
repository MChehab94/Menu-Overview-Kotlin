package mchehab.com.menuoverview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id = item?.itemId
        when(id){
            R.id.item1 -> createToast("Item 1 selected")
            R.id.item2 -> createToast("Item 2 selected")
        }
        return true
    }

    private fun createToast(message: String){
        Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
    }
}
