package com.techafresh.factz.presentation.hilt

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.techafresh.factz.data.room.dao.FactsDao
import com.techafresh.factz.data.room.db.FactsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    @Singleton
    fun provideFactsDatabase(app : Application) : FactsDatabase{
        return Room.databaseBuilder(app , FactsDatabase::class.java , "facts_database")
            .fallbackToDestructiveMigration().build()
    }

    @Provides
    @Singleton
    fun provideFactsDao(factsDatabase: FactsDatabase) : FactsDao{
        return factsDatabase.factsDao()
    }
}