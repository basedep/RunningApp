package projects.vaid.runningapp.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import projects.vaid.runningapp.database.RunningDatabase
import projects.vaid.runningapp.utils.Constants.DATABASE_NAME
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        RunningDatabase::class.java,
        DATABASE_NAME
    ).build()

    @Provides
    @Singleton
    fun provideRunDao(database: RunningDatabase) =
        database.getDao()


}