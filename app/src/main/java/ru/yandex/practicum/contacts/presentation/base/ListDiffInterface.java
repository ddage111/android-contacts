package ru.yandex.practicum.contacts.presentation.base;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public interface ListDiffInterface<T> {
    public boolean theSameAs(T otherList);
    public boolean equals(Object otherList);

}
