tableextension 50106 ExtendedDirector extends Director

{


    fields
    {
        field(4; DomesticSalesIncome; Decimal) //Sum of the Domestic Sales of the movies directed by the director
        {
            FieldClass = FlowField;
            CalcFormula = sum(BoxOffice.DomesticSales);

        }

        field(5; AverageRating; Integer) //The average rating of the movies directed by the director
        {
            FieldClass = FlowField;
            CalcFormula = average(BoxOffice.Rating);

        }

        field(6; TotalMovies; Integer) //The number of movies directed by the director
        {
            FieldClass = FlowField;
            CalcFormula = Count(); //??
        }

    }




}
