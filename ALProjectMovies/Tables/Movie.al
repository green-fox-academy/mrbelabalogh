table 50102 Movie

{
    fields

    {

        field(1; Title; Text[250])
        {

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
                        Error('The Movie must be older than 2022.')






        }

        field(3; LengthInMinutes; Integer)
        {

        }

        field(4; DirectorID; Integer)
        {

        }

        field(5; DirectorName; Text[240])
        {
            FieldClass = FlowField;

            CalcFormula = lookup(Director.Name where(Id = field(DirectorId)));
        }

    }

    Keys
    {
        Key(PK; Title)
        {

        }

    }
}

