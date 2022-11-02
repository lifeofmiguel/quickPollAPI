package com.QuickPoll.Quick.Poll.repository;

import com.QuickPoll.Quick.Poll.domain.Options;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionsRepository extends CrudRepository<Options, Long> {
}
