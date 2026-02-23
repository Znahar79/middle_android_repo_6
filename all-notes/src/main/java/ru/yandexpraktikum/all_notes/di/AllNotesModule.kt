package ru.yandexpraktikum.all_notes.di

import dagger.Binds
import dagger.Module
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractor
import ru.yandexpraktikum.all_notes.domain.interactors.DeleteNoteInteractorImpl
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractor
import ru.yandexpraktikum.all_notes.domain.interactors.FetchAllNotesInteractorImpl
import javax.inject.Scope

@Module
interface AllNotesModule {
    @Binds
    @AllNotesScope
    fun bindFetchAllNotesUsecase(impl: FetchAllNotesInteractorImpl): FetchAllNotesInteractor

    @Binds
    @AllNotesScope
    fun bindDeleteNoteUsecase(impl: DeleteNoteInteractorImpl): DeleteNoteInteractor
}

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AllNotesScope