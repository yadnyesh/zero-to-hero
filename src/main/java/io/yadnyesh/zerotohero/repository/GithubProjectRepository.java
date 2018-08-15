package io.yadnyesh.zerotohero.repository;

import io.yadnyesh.zerotohero.model.GithubProject;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GithubProjectRepository extends PagingAndSortingRepository<GithubProject, Long> {

	GithubProject findByRepoName(String repoName);
}
