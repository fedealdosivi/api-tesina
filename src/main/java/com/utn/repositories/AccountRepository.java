package com.utn.repositories;

import com.utn.models.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Matias on 16/08/2018.
 */
@Repository
public interface AccountRepository extends CrudRepository<Account,Long>{
}
