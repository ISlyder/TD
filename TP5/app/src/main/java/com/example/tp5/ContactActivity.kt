package com.example.tp5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContactActivity : AppCompatActivity() {

    var contacts : ArrayList<Contact> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val rvContact : RecyclerView = findViewById(R.id.rvContacts)

        contacts.add(Contact("Duvivier","Clément",""))
        contacts.add(Contact("Lavie","Clément",""))
        contacts.add(Contact("Duvivier","Clément",""))
        contacts.add(Contact("Lavie","Clément",""))
        contacts.add(Contact("Duvivier","Clément",""))
        contacts.add(Contact("Lavie","Clément",""))
        contacts.add(Contact("Duvivier","Clément",""))
        contacts.add(Contact("Test","Clément",""))

        val adapter : ContactAdapter = ContactAdapter(contacts)

        rvContact.adapter = adapter

        rvContact.layoutManager = LinearLayoutManager(this)

    }
}