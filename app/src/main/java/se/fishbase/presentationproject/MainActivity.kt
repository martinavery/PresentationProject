package se.fishbase.presentationproject

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.Dialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv: RecyclerView = findViewById(R.id.rv)
        val adapter = PostAdapter(generateDummyData())
        val layoutMan = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv.adapter = adapter
        rv.layoutManager = layoutMan
    }

    private fun generateDummyData(): List<Post> {
        return listOf(
            Post(
                posterName = "Goku",
                postDesc = "Kameha meha"
            ),
            Post(
                posterName = "Deku",
                postDesc = "SMASHHHHHHHHHHHHHHHHHHHHHHHHHHHh"
            ),
            Post(
                posterName = "Naruto",
                postDesc = "Rasengannnnnnnnnnnnnn"
            ),
            Post(
                posterName = "Jaja",
                postDesc = "Hello"
            )
        )
    }
}