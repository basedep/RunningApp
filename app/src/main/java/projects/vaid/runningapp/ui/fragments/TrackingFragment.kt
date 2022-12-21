package projects.vaid.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import projects.vaid.runningapp.R
import projects.vaid.runningapp.ui.viewmodels.MainViewModel

@AndroidEntryPoint
class TrackingFragment :  Fragment(R.layout.fragment_tracking){

    private val viewModel : MainViewModel by viewModels()

}