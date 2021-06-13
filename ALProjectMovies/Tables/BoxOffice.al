table 50103 BoxOffice

{
    fields
    {
        field(1; Rating; Integer)
        {

        }


        field(2; DomesticSales; Integer)
        {
            trigger OnValidate()
            begin
                if DomesticSales < 0 then begin
                    Error('DomesticSales cannot be a negative number');
                end;
            end;

        }

        field(3; InternationalSales; Integer)
        {
            trigger OnValidate()
            begin
                if InternationalSales < 0 then begin
                    FieldError(InternationalSales, 'International Sales cannot be a negative number')
                end;
            end;

        }

        field(4; MovieId; Integer)
        {
            TableRelation = Movie;
            DataClassification = ToBeClassified;
            // ??
        }

        field(5; MovieTitle; Text[250])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Movie.Title where(Id = field(MovieId)));

        }



        field(6; Id; Integer)
        {
            DataClassification = ToBeClassified;
        }

        field(7; DirectorId; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Movie.DirectorID where(Id = field(MovieId)));
        }
    }

}