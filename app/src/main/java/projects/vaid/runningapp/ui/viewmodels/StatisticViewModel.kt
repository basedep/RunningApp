package projects.vaid.runningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import projects.vaid.runningapp.repositories.Repository
import javax.inject.Inject

@HiltViewModel
class StatisticViewModel @Inject constructor(
    val repository: Repository
): ViewModel(){

}