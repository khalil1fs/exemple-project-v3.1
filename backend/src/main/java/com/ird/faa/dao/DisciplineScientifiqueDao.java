package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.DisciplineScientifique;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface DisciplineScientifiqueDao extends JpaRepository<DisciplineScientifique,Long> {





    @Query("SELECT item FROM DisciplineScientifique item ORDER BY item.code ASC")
    List<DisciplineScientifique> findAll();

    DisciplineScientifique findByCode(String code);

    int deleteByCode(String code);

    List<DisciplineScientifique> findByDisciplineScientifiqueParentCode(String code);
    int deleteByDisciplineScientifiqueParentCode(String code);

    List<DisciplineScientifique> findByDisciplineScientifiqueParentId(Long id);

    int deleteByDisciplineScientifiqueParentId(Long id);


}
