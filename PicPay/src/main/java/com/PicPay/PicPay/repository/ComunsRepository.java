package com.PicPay.PicPay.repository;

import com.PicPay.PicPay.models.ComunsModel;
import com.PicPay.PicPay.models.LojistasModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ComunsRepository extends CrudRepository<ComunsModel, Long> {
//    @Modifying
//    @Query(value = "Update comuns_model c set c.saldo = ?1 WHERE id= 1")
//    void atualizaSaldo(int atualizaSaldo);
}
