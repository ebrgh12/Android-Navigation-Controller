package com.girish.navcontroller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import java.util.zip.Inflater

class FragmentB : Fragment(),View.OnClickListener {

    lateinit var navCont: NavController
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_b, container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        navCont= Navigation.findNavController(view)
        view.findViewById<Button>(R.id.launchCBtn).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.launchBBtn ->navCont.navigate(R.id.action_fragmentB_to_fragmentC)
        }
    }
}