page 50103 YourHeadLine
{
    PageType = HeadLinePart;

    layout{
        area(content)
        {
            field(Headline1; headline1Text)
            {
                ApplicationArea = All;
            }
        }
    }

    var
        headline1Text: Label 'This is the test headline 1';
}
