

package com.frovis.vuitro.data.local.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.frovis.vuitro.data.local.db.dao.OptionDao;
import com.frovis.vuitro.data.local.db.dao.QuestionDao;
import com.frovis.vuitro.data.local.db.dao.UserDao;
import com.frovis.vuitro.data.model.db.Option;
import com.frovis.vuitro.data.model.db.Question;
import com.frovis.vuitro.data.model.db.User;

/**
 * Created by amitshekhar on 07/07/17.
 */

@Database(entities = {User.class, Question.class, Option.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {

    public abstract OptionDao optionDao();

    public abstract QuestionDao questionDao();

    public abstract UserDao userDao();
}
