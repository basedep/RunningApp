package projects.vaid.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import projects.vaid.runningapp.R
import projects.vaid.runningapp.ui.viewmodels.MainViewModel

@AndroidEntryPoint
class RunFragment :  Fragment(R.layout.fragment_run){

    private val viewModel : MainViewModel by viewModels()
}