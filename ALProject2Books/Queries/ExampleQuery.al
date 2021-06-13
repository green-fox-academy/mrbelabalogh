

query 50100 ExampleQuery
{

    QueryType = Normal;

    elements
    {

        // Select name from Author
        // Select Author.Name, Book.Title, Book.PageCount from Author inner join Book on Book.AuthorId = Author.Id


        dataitem(AuthorTable; Author)
        {
            column(AuthorName; Name)
            {


            }



            dataitem(MyBook; Book)
            {
                DataItemLink = AuthorId = AuthorTable.Id;
                SqlJoinType = InnerJoin;



                Column(PageCount; PageCount)
                { }
            }
        }
    }
}

