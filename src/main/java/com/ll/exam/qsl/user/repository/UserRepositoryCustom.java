package com.ll.exam.qsl.user.repository;

import com.ll.exam.qsl.user.entity.SiteUser;

import java.util.List;

public interface UserRepositoryCustom {
    SiteUser getQslCount(Long id);
    long getQslCount();

    SiteUser getQslUserOrderByIdAscOne();

    List<SiteUser> getQslUsersOrderByIdAsc();

    List<SiteUser> searchQsl(String user1);
}

