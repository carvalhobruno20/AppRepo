package br.com.bruno.app_repo.domain

import br.com.bruno.app_repo.core.UseCase
import br.com.bruno.app_repo.data.model.Repo
import br.com.bruno.app_repo.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}