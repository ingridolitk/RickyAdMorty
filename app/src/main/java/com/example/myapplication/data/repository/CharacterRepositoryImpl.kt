package com.example.myapplication.data.repository

import com.example.myapplication.data.datasource.CharacterDataSource
import com.example.myapplication.data.model.CharactersResponse
import kotlinx.coroutines.flow.Flow

class CharacterRepositoryImpl(private val dataSource: CharacterDataSource): CharacterRepository {

    override fun getCharacterRepository() : Flow<CharactersResponse>{
        return dataSource.getCharacters()
    }

}