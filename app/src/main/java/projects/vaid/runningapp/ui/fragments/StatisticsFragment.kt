package projects.vaid.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import projects.vaid.runningapp.R
import projects.vaid.runningapp.ui.viewmodels.MainViewModel
import projects.vaid.runningapp.ui.viewmodels.StatisticViewModel

@AndroidEntryPoint
class StatisticsFragment :  Fragment(R.layout.fragment_statistics){

    private val viewModel : StatisticViewModel by viewModels()

}