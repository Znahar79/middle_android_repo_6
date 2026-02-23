package ru.yandexpraktikum.all_notes.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractor
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractorImpl
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractor
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractorImpl
import javax.inject.Scope

@Module
@InstallIn(ViewModelComponent::class)
internal interface AllNotesModule {
    @Binds
    fun bindFetchAllNotesUsecase(impl: FetchAllNotesInteractorImpl): FetchAllNotesInteractor

    @Binds
    fun bindDeleteNoteUsecase(impl: DeleteNoteInteractorImpl): DeleteNoteInteractor
}