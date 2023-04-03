package com.se.cineplex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.se.cineplex.entity.Voucher;

@Repository
public interface VoucherRepository extends JpaRepository<Voucher, Integer> {

}
