package br.com.bruno.app_repo.data.repositories

import br.com.bruno.app_repo.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}