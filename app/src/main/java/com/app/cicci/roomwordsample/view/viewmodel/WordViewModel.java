package com.app.cicci.roomwordsample.view.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.app.cicci.roomwordsample.entity.Word;
import com.app.cicci.roomwordsample.repository.WordRepository;

import java.util.List;

/**
 * Created by ${$USER_NAME} on 6/18/18.
 */
public class WordViewModel extends AndroidViewModel {

    private WordRepository mRepository;
    private LiveData<List<Word>> mAllWords;

    public WordViewModel (Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    public void insert(Word word) { mRepository.insert(word); }

    public LiveData<List<Word>> getAllWords() { return mAllWords; }
}
