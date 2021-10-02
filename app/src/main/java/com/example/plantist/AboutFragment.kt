package com.example.plantist

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

class AboutFragment : Fragment() , View.OnClickListener{

    private lateinit var imgbtnCallMe : ImageButton
    private lateinit var imgbtnFeedback : ImageButton
    private lateinit var imgbtnAboutapp : ImageButton

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView: View = inflater.inflate(R.layout.fragment_about, container, false)

        imgbtnCallMe = rootView.findViewById(R.id.imgbtn_callme)
        imgbtnCallMe.setOnClickListener(this)

        imgbtnFeedback = rootView.findViewById(R.id.imgbtn_feedback)
        imgbtnFeedback.setOnClickListener(this)

        imgbtnAboutapp = rootView.findViewById(R.id.imgbtn_aboutapp)
        imgbtnAboutapp.setOnClickListener(this)

        return rootView
    }

    companion object {
        fun newInstance() =
            AboutFragment().apply {
                arguments = Bundle().apply {}
            }
    }


    override fun onClick(v: View) {
        when(v.id){
            R.id.imgbtn_callme -> {
                val phoneNumber = "081334220782"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }

            R.id.imgbtn_feedback -> {
                val myEmail = "wirandanaputra@gmail.com"
                val emailSubject = "Plantist App"
                val emailMessage = "Hello RahDeva! Your First App is ... "
                val feedbackIntent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:")
                    putExtra(Intent.EXTRA_EMAIL,myEmail.split(",".toRegex()).toTypedArray())
                    putExtra(Intent.EXTRA_SUBJECT, emailSubject)
                    putExtra(Intent.EXTRA_TEXT,emailMessage)
                }
                startActivity(feedbackIntent)
            }

            R.id.imgbtn_aboutapp -> {
                val aboutappIntent = Intent(context,AboutAppActivity::class.java)
                startActivity(aboutappIntent)
            }
        }
    }
}