package com.app.cicci.roomwordsample.asynctasks;

import android.os.AsyncTask;

import com.app.cicci.roomwordsample.dao.WordDao;
import com.app.cicci.roomwordsample.database.WordRoomDatabase;
import com.app.cicci.roomwordsample.entity.Word;

/**
 * Created by ${$USER_NAME} on 6/18/18.
 */
public class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

    private final WordDao mDao;

    public PopulateDbAsync(WordRoomDatabase db) {
        mDao = db.wordDao();
    }

    @Override
    protected Void doInBackground(final Void... params) {
        mDao.deleteAll();
        Word word = new Word("Hello");
        mDao.insert(word);
        word = new Word("World");
        mDao.insert(word);
        return null;
    }
}
