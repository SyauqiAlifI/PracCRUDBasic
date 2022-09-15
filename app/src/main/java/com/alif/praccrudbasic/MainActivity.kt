package com.alif.praccrudbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alif.praccrudbasic.databinding.ActivityMainBinding
import com.alif.praccrudbasic.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding as ActivityMainBinding

    private lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}