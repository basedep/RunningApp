package projects.vaid.runningapp.repositories

import projects.vaid.runningapp.database.Run
import projects.vaid.runningapp.database.RunDao
import javax.inject.Inject

class Repository @Inject constructor(
   private val dao: RunDao
){
    suspend fun insertRun(run: Run) = dao.insertRun(run)

    suspend fun deleteRun(run: Run) = dao.insertRun(run)

    fun getAllRunsSortedByDate() = dao.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = dao.getAllRunsSortedByDistance()

    fun getAllRunsSortedByTime() = dao.getAllRunsSortedByTime()

    fun getAllRunsSortedByAVGSpeed() = dao.getAllRunsSortedByAvgSpeed()

    fun getTotalAVGSpeed() = dao.getTotalAvgSpeed()

    fun getTotalCaloriesBurned() = dao.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = dao.getTotalTimeInMillis()

    fun getTotalDistance() = dao.getTotalDistance()

}