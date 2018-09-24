package com.onegday.pl33111.rodowita2

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.onegday.pl33111.rodowita2.R.id.parent
import kotlinx.android.synthetic.main.upowaznienia_prywatne_item.view.*

class UpowaznieniaPrywatneActivity: Fragment() {

    lateinit var lista_upowaznien : RecyclerView
    var upowaznienia: MutableList<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


      //1  loadData()
        //lista_upowaznien = R.id.recViewlistaUpowaznienID
       //1 lista_upowaznien.layoutManager = LinearLayoutManager(activity)
        //lista_upowaznien.layoutManager = GridLayoutManager(this,2)
      //1  lista_upowaznien.adapter = AdapterUpowaznienia(upowaznienia, activity)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //loadData()
        //lista_upowaznien.layoutManager = LinearLayoutManager(this)
       // lista_upowaznien.adapter = AdapterUpowaznienia(upowaznienia, this)
            return inflater!!.inflate(R.layout.fragment_upowaznienia_prywatne, container, false)
    }

    class AdapterUpowaznienia(items: List<String>, ctx: Context?) : RecyclerView.Adapter<AdapterUpowaznienia.ViewHolder>() {
        var lista = items
        var context = ctx

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(LayoutInflater.from(context).inflate(R.layout.fragment_upowaznienia_prywatne,parent,false))
        }

        override fun getItemCount(): Int {
            return lista.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder?.nazwa?.text  = lista.get(position)
        }


        class ViewHolder(v:View) : RecyclerView.ViewHolder(v) {
            val nazwa = v.textView_NazwaWlasnaID
        }
    }

    fun loadData() {
        upowaznienia.add("upowaznienie_1")
        upowaznienia.add("upowaznienie_2")
        upowaznienia.add("upowaznienie_3")
        upowaznienia.add("upowaznienie_4")
        upowaznienia.add("upowaznienie_5")
        upowaznienia.add("upowaznienie_6")
        upowaznienia.add("upowaznienie_7")
        upowaznienia.add("upowaznienie_8")
        upowaznienia.add("upowaznienie_9")
        upowaznienia.add("upowaznienie_10")

    }
}