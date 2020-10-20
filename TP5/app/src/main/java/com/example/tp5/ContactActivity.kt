package com.example.tp5

import android.content.Context
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

        contacts.add(Contact("Duvivier","Clément","https://scontent.fcdg2-1.fna.fbcdn.net/v/t1.0-9/40403687_10212524589565161_3813355304381317120_o.jpg?_nc_cat=104&_nc_sid=09cbfe&_nc_ohc=2DiwMsdy-pkAX8N6Vb1&_nc_ht=scontent.fcdg2-1.fna&oh=7e5f27062ee8771678c7d22c0d223389&oe=5FB37A2F"))
        contacts.add(Contact("Lavie","Antonin","https://scontent.fcdg2-1.fna.fbcdn.net/v/t1.0-9/69848966_2394061624182594_3370206415640592384_n.jpg?_nc_cat=104&_nc_sid=09cbfe&_nc_ohc=pnbh_0mZjOIAX8e0cNu&_nc_ht=scontent.fcdg2-1.fna&oh=643c41fe5aa657ba6bf6cfe84b2f71b4&oe=5FB3547C"))
        contacts.add(Contact("Cherkaoui","Jihane","https://scontent.fcdg2-1.fna.fbcdn.net/v/t1.0-9/74209209_2558518614369521_9085674938668417024_o.jpg?_nc_cat=105&_nc_sid=09cbfe&_nc_ohc=SpCbi4MkfLAAX-b9oxM&_nc_ht=scontent.fcdg2-1.fna&oh=cf4cb7d96df6805f48cb12373f9c5a41&oe=5FB5D0C7"))

        val adapter : ContactAdapter = ContactAdapter(contacts, this)

        rvContact.adapter = adapter

        rvContact.layoutManager = LinearLayoutManager(this)

    }
}