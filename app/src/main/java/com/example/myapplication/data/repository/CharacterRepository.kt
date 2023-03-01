package com.example.myapplication.data.repository

import com.example.myapplication.data.model.CharactersResponse
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {

    fun getCharacterRepository() : Flow<CharactersResponse>
}