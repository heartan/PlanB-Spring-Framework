package sping.in.action.chapter5.spittr.repository;

import sping.in.action.chapter5.spittr.domain.Spittle;

import java.util.List;


public interface SpittleRepository {

    List<Spittle> findRecentSpittles();

    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long id);

    void save(Spittle spittle);

}
