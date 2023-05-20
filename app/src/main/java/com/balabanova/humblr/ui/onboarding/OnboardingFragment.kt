package com.balabanova.humblr.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.balabanova.humblr.R
import com.balabanova.humblr.databinding.FragmentOnboardingBinding
import com.balabanova.humblr.tools.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OnboardingFragment : BaseFragment<FragmentOnboardingBinding>() {

    private var mediator: TabLayoutMediator? = null

    override fun initBinding(inflater: LayoutInflater) = FragmentOnboardingBinding.inflate(inflater)
    private val viewModel by viewModels<OnboardingViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewPager()
        setTabs()
        setAuthorizeButton()
        saveOnboardingShown()
    }

    private fun setViewPager() {
        binding.viewPager.adapter = ViewPagerAdapter(
            resources.getStringArray(R.array.onboarding_texts_array1),
            resources.getStringArray(R.array.onboarding_texts_array2),

            arrayOf(
                ResourcesCompat.getDrawable(resources, R.drawable.onb_image1, null)
                    ?: error("lost onboarding image1"),
                ResourcesCompat.getDrawable(resources, R.drawable.onb_image2, null)
                    ?: error("lost onboarding image2"),
                ResourcesCompat.getDrawable(resources, R.drawable.onb_image3, null)
                    ?: error("lost onboarding image3"),
            )
        )
        binding.viewPager.registerOnPageChangeCallback(
            ChangeButtonTextOnPageChange(
                binding.skipButton,
                requireContext(),
                resources.getStringArray(R.array.onboarding_texts_array1).lastIndex
            )
        )
    }

    private fun setTabs() {
        mediator = TabLayoutMediator(binding.tabs, binding.viewPager) { _, _ -> }
        mediator!!.attach()
    }

    private fun setAuthorizeButton() {
        binding.skipButton.background = null

        binding.skipButton.setOnClickListener {
            viewModel.navigateToAuth(this)
        }
    }

    private fun saveOnboardingShown() {
        viewModel.saveOnboardingShown()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mediator?.detach()
        mediator = null
    }
}
