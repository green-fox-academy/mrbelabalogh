table 50102 Movie

{
    fields

    {

        field(1; Title; Text[250])
        {
            DataClassification = ToBeClassified;



        }

        field(2; Year; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate();
            begin
                Message('OnValidate has run');
                if Rec.Year < 1900 then begin
                    Error('The Movie must be newer than 1900.');
                end
                else
                    if Rec.Year > 2021 then begin
                        Error('The Movie must be older than 2022.');
                    end;
            end;
        }

        field(3; LengthInMinutes; Integer)
        {
            trigger OnValidate();
            begin
                if Rec.LengthInMinutes < 60 then begin
                    Error('The movie has to be 60 minutes or longer');
                end;
            end;

        }

        field(4; DirectorID; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Director;

        }

        field(5; DirectorName; Text[240])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Director.Name where(Id = field(DirectorId)));
        }

        field(6; Id; Integer)
        {

        }

    }

    Keys
    {
        Key(PK; Id)
        {

        }

    }
}

