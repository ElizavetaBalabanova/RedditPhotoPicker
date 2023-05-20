package com.balabanova.humblr.ui.authorization

import android.content.ContentValues.TAG
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.balabanova.humblr.R
import com.balabanova.humblr.data.api.*
import com.balabanova.humblr.databinding.FragmentAuthBinding
import com.balabanova.humblr.domain.state.States
import com.balabanova.humblr.tools.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class AuthFragment : BaseFragment<FragmentAuthBinding>() {

    override fun initBinding(inflater: LayoutInflater) = FragmentAuthBinding.inflate(inflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setAuthorizationButton()
    }

    private fun setAuthorizationButton() {
        binding.authButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(AUTHREDDIT))
            startActivity(intent)
        }
    }
}
