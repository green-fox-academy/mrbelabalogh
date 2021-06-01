query 50101 AggregateQuery

QueryType = Normal;

    elements
    {

        // Select name from Author
        // Select Author.Name, Book.Title, Book.PageCount from Author inner join Book on Book.AuthorId = Author.Id

        // Select Author.Name, SUM(Book.PageCount) from Author inner join Book on Book.AuthorId = Author.Id group by Author.Name
        // Select top 1 (Author.Name, SUM(Book.PageCount)) from Author inner join Book on Book.AuthorId = Author.Id
        // order by SumBookPageCount desc.
        // group by Author.Name

        dataitem(AuthorTable; Author)
        {//DataItemTableFilter
            column(AuthorName; Name)
            {
                //ColumnFilter = AuthorName = const('Jordan Peterson'); where Author.Name = 'Jordan Peterson

            }
            /*
            filter(FilterName; SourceFieldName)
            {

            } */

            dataitem(MyBook; Book)
            {
                DataItemLink = AuthorId = AuthorTable.Id;
                SqlJoinType = InnerJoin;


                Column(SumBookPageCount; PageCount)
                {
                    Method = Sum;
                }

            }

        }
    }

    trigger onBeforeOpen()
    begin
        //SetFilter(SumBookPageCount);
        TopNumberOfRows(1);
    end;
}
}