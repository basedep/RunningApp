package projects.vaid.runningapp.database

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run(
    var img: Bitmap? = null,
    var timestamp: Long = 0L,   //начало бега
    var averageSpeed: Float = 0f,
    var distanceInMeters: Int = 0,
    var timeInMillis: Long = 0L,    //продолжительность бега
    var caloriesBurned: Int = 0
){
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}