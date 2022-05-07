package com.example.myfirstapp.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.myfirstapp.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    var currentButtonStateClicked = false
    override fun onViewCreated (view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textfield = view.findViewById<TextView>(R.id.message)           // Adds a value to call the text field
        textfield.text = "My own Text"                                     // Changes the text of the text field

        val myButton = view.findViewById<Button>(R.id.btn_first)          // Adds Button as value
        myButton.setOnClickListener {
            if (currentButtonStateClicked) {                              // if Button is not clicked it displays "Click me"
                myButton.text = "Click me!"
                currentButtonStateClicked = false
            } else {
                myButton.text = "I was clicked!"                          // if it is clicked it displays "I was clicked"
                currentButtonStateClicked = true
            }
        }
}
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}